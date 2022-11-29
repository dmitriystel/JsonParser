package com.stelmashok.jsonparser.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stelmashok.jsonparser.bean.Dota2SearchResultList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserJavaToJson {

    public static void writeStringInJson(String path, Object someObject) throws IOException {
        File file = new File(path);
        ObjectMapper om = new ObjectMapper();
        om.writeValue(file, someObject);

    }

//    public static void writeListInJson(String path, List<Dota2SearchResultList> dota2SearchResultList) throws IOException {
//        File file = new File(path);
//        ObjectMapper om = new ObjectMapper();
//        om.writeValue(file, dota2SearchResultList);
//    }

}
