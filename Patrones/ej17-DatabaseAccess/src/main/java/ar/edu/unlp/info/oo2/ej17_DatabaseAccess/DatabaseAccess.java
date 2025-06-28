package ar.edu.unlp.info.oo2.ej17_DatabaseAccess;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	int insertNewRow(List<String> rowData);
	
	Collection<String> getSearchResults(List<String> queryString);
}
