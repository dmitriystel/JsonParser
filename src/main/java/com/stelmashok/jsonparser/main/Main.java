package com.stelmashok.jsonparser.main;

import com.stelmashok.jsonparser.bean.Dota2SearchResultList;
import com.stelmashok.jsonparser.bean.Platform;
import com.stelmashok.jsonparser.bean.PrivacyPolicyRevision;
import com.stelmashok.jsonparser.parser.ParserJavaToJson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String POLICY_REVISION_PATH = "src/main/resources/PrivacyPolicyRevision.json";
    public static final String DOTA2_SEARCH_RESULT_LIST_PATH = "src/main/resources/Dota2SearchResultList.json";

    public static void main(String[] args) throws IOException {

        PrivacyPolicyRevision policyRevision = new PrivacyPolicyRevision("Дата изменения — 16 февраля 2022 г.");
        ParserJavaToJson parserJavaToJson = new ParserJavaToJson();
        ParserJavaToJson.writeStringInJson(POLICY_REVISION_PATH, policyRevision);



        List<Dota2SearchResultList> dota2SearchResultLists = new ArrayList<>();

//        Dota2SearchResultList dota2SearchResultList = new Dota2SearchResultList();

        Dota2SearchResultList dota2SearchResultList1 =
                new Dota2SearchResultList("Dota 2", new Platform(true, true, true),
                        "9 июл. 2013", "очень положительные", "Бесплатно" );

        dota2SearchResultLists.add(dota2SearchResultList1);

        Dota2SearchResultList dota2SearchResultList2 =
                new Dota2SearchResultList("The Dota 2 Remixes EP", new Platform(true),
                        "11 фев. 2020", "очень положительные", "Бесплатно");

        dota2SearchResultLists.add(dota2SearchResultList2);

//        ParserJavaToJson.writeListInJson(DOTA2_SEARCH_RESULT_LIST_PATH, dota2SearchResultLists);
        ParserJavaToJson.writeStringInJson (DOTA2_SEARCH_RESULT_LIST_PATH, dota2SearchResultLists);
    }
}
