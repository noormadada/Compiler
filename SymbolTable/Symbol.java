package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class Symbol {
    private final String name;
    private final String type;
    private final int arrayLength;
    private final List<String> properties; // NEW

    public Symbol(String name, String type) {
        this(name, type, -1, null);
    }

    public Symbol(String name, String type, int arrayLength) {
        this(name, type, arrayLength, null);
    }

    public Symbol(String name, String type, List<String> properties) {
        this(name, type, -1, properties);
    }

    public Symbol(String name, String type, int arrayLength, List<String> properties) {
        this.name = name;
        this.type = type;
        this.arrayLength = arrayLength;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public List<String> getProperties() {
        return properties != null ? properties : new ArrayList<>();
    }
}
