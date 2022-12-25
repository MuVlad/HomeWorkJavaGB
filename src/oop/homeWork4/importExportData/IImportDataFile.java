package oop.homeWork4.importExportData;

import java.util.Map;

public interface IImportDataFile<T,V> {
    Map<T,V> read();
}
