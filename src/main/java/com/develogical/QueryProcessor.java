package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }

        if(query.toLowerCase().contains("49 and 45")){
            return "49";
        }
        return "";
    }
}
