package SymbolTable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, Symbol> symbols = new HashMap<>();

    public void define(Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public Symbol resolve(String name) {
        return symbols.get(name);
    }

    public boolean contains(String name) {
        return symbols.containsKey(name);
    }

    public void remove(String name) {
        symbols.remove(name);
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }
}
