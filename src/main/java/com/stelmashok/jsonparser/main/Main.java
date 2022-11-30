package com.stelmashok.jsonparser.main;

import com.stelmashok.jsonparser.bean.GameInformation;
import com.stelmashok.jsonparser.bean.Platform;
import com.stelmashok.jsonparser.bean.PrivacyPolicyRevision;
import com.stelmashok.jsonparser.parser.ParserJavaToJson;
import com.stelmashok.jsonparser.parser.ParserJsonToJava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.stelmashok.jsonparser.parser.ParserJsonToJava.jsonParse;

public class Main {

    public static final String POLICY_REVISION_DB_PATH = "src/main/resources/PrivacyPolicyRevisionDB.json";
    public static final String DOTA2_SEARCH_RESULT_LIST_DB_PATH = "src/main/resources/Dota2SearchResultListDB.json";
    public static final String SECOND_SEARCH_GAME_RESULT_LIST_DB_PATH = "src/main/resources/SecondSearchGameResultListDB.json";

    public static void main(String[] args) throws IOException {

        PrivacyPolicyRevision policyRevision = new PrivacyPolicyRevision("Дата изменения — 16 февраля 2022 г.");
        ParserJavaToJson.writeJavaInJson(POLICY_REVISION_DB_PATH, policyRevision);
        // First searching and write to json
        List<GameInformation> gameInformationResult1 = new ArrayList<>();

        GameInformation gameInformationResult1_Game1 =
                new GameInformation("Dota 2", new Platform(true, true, true),
                        "9 июл. 2013", "очень положительные", "Бесплатно" );
        gameInformationResult1.add(gameInformationResult1_Game1);

        GameInformation gameInformationResult1_Game2 =
                new GameInformation("The Dota 2 Remixes EP", new Platform(true),
                        "11 фев. 2020", "очень положительные", "Бесплатно");
        gameInformationResult1.add(gameInformationResult1_Game2);

        ParserJavaToJson.writeJavaInJson(DOTA2_SEARCH_RESULT_LIST_DB_PATH, gameInformationResult1);

        // Second searching and write to json
        List<GameInformation> gameInformationResult2 = new ArrayList<>();

        GameInformation gameInformationResult2_Game1 = new GameInformation("The Dota 2 Remixes EP",
                new Platform(true), "11 фев. 2020", "очень положительные", "Бесплатно");
        gameInformationResult2.add(gameInformationResult2_Game1);

        GameInformation gameInformationResult2_Game2 = new GameInformation("Valve Complete Pack",
                new Platform(true), null, "очень положительные", "$41.68");
        gameInformationResult2.add(gameInformationResult2_Game2);

        ParserJavaToJson.writeJavaInJson(SECOND_SEARCH_GAME_RESULT_LIST_DB_PATH, gameInformationResult2);

        // Read from json
        List<GameInformation> gameListFromJson1 = jsonParse(DOTA2_SEARCH_RESULT_LIST_DB_PATH);
//        GameInformation gameListFromJson1 = (GameInformation) ParserJsonToJava.jsonParse(DOTA2_SEARCH_RESULT_LIST_DB_PATH);

        System.out.println(gameListFromJson1);



    }
}
