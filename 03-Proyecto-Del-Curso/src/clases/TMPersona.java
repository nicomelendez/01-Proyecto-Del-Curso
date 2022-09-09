package clases;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class TMPersona implements TableModel{
	
	private ArrayList<Persona> listaDePersonas;	
	
	public TMPersona(ArrayList<Persona> listaDePersonas) {
		
		this.listaDePersonas = listaDePersonas;
		
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaDePersonas.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		String titulo = null;
		
		switch(columnIndex) {
			case 0:			
				titulo = "ID";
				break;
			
			case 1:
				titulo = "Nombre";
				break;
			
			case 2:
				titulo = "Apellido";
				break;				
			
			case 3:
				titulo = "Departamento";
				break;				
			
			case 4:		
				titulo = "Hijos";
				break;
			
			case 5:		
				titulo = "Fecha de Nacimiento";
				break;
		
		}
		return titulo;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex != 0;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Persona p = listaDePersonas.get(rowIndex);
		String valor = null;
		switch(columnIndex) {
			case 0:{				
				valor = Integer.toString(p.getIdPersona());
				break;
			}
			case 1:{
				valor = p.getNombre();
				break;
			}
			case 2:{
				valor = p.getApellido();
				break;				
			}
			case 3:{
				valor = p.getDptoResidencia();
				break;				
			}
			case 4:{				
				valor =  Byte.toString(p.getCantHijos());
				break;
			}
			case 5:{				
				valor = p.getFechaNacimiento().toString();
				break;
			}
		}
		return valor;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Persona p = listaDePersonas.get(rowIndex);
		switch(columnIndex) {
		case 0:{				
			p.setIdPersona((int)aValue);
			break;
		}
		case 1:{
			p.setNombre((String)aValue);
			break;
		}
		case 2:{
			p.setApellido((String)aValue);
			break;				
		}
		case 3:{
			p.setDptoResidencia((String)aValue);
			break;				
		}
		case 4:{				
			p.setCantHijos((byte)aValue);
			break;
		}
		case 5:{				
			p.setFechaNacimiento((LocalDate)aValue);
			break;
		}
	}
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

}
