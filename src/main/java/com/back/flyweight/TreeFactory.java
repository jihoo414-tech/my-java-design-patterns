package com.back.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String textureData){
        String key = name + "_" + color;
        TreeType result = treeTypes.get(key);

        if (result == null) {
            result = new TreeType(name, color, textureData);
            treeTypes.put(key, result); // 캐시에 저장
        }
        return result;
    }
    public static int getCreatedObjectCount() {
        return treeTypes.size();
    }
}
