package com.stelmashok.jsonparser.parser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ParserJavaToJson {

    public static void writeJavaInJson(String path, Object someObject) throws IOException {
        File file = new File(path);
        ObjectMapper om = new ObjectMapper();
        om.writeValue(file, someObject);

    }


}
