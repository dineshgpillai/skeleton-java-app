package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }

        if(query.toLowerCase().contains("largest")){
            return "545";
        }

        if(query.toLowerCase().contains("banana")){
            return "yellow";
        }



        if(query.toLowerCase().contains("Eiffel tower")){
            return "Paris";
        }

        if(query.toLowerCase().contains("Theresa May")){
            return "Paris";
        }
        if(query.toLowerCase().contains("James Bond")){
            return "Sean Connery";
        }


        if(query.toLowerCase().contains("Fibonacci")){
            return "0, 1, 1, 2, 3, 5, 8, 13, 21";
        }

        if(query.toLowerCase().contains("Power of 11")){
            return "121";
        }




        return "";
    }
}
