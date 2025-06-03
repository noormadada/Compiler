package SymbolTable;

import java.util.List;
import java.util.Map;

public class SymbolTablePrinter {

    public static void print(SymbolTable table, List<String> onlyNames) {
        System.err.println("======= Symbol Table =======");

        for (Map.Entry<String, Symbol> entry : table.getSymbols().entrySet()) {
            Symbol symbol = entry.getValue();
            if (onlyNames.contains(symbol.getName())) {
                System.err.printf("Name: %s    Type: %s", symbol.getName(), symbol.getType());
                if (symbol.getType().equals("array")) {
                    System.err.printf("     Length: %d", symbol.getArrayLength());
                }
                System.err.println();
            }
        }

        System.err.println("============================");
    }

}


