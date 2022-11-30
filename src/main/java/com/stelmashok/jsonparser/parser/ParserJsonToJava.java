package com.stelmashok.jsonparser.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stelmashok.jsonparser.bean.GameInformation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParserJsonToJava {
//
//    public static List<GameInformation> jsonParse(String path) throws IOException {
//        File file = new File(path);
//        ObjectMapper om = new ObjectMapper();
//        List<GameInformation> users = Arrays.asList(om.readValue(Paths.get(String.valueOf(file)).toFile(), GameInformation[].class));
//        return users;
//    }

//    public static List<GameInformation> jsonParse(String path) throws IOException {
//        File file = new File(path);
//        ObjectMapper om = new ObjectMapper();
//        List<GameInformation> info = (List<GameInformation>) om.readValue(file, GameInformation.class);
//        return info;
//    }

    public static List<GameInformation> jsonParse(String path) throws IOException {
        File file = new File(path);
        ObjectMapper om = new ObjectMapper();
        List<GameInformation> result = om.readValue(file, new TypeReference<List<GameInformation>>(){});
        return result;
    }


}
