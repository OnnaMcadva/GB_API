package org.example.lesson2;

class Answer3 {
    public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        StringBuilder sb = new StringBuilder();
        String newJSON = JSON.replaceAll("\\{", "").replaceAll("\\}", "")
                .replaceAll("\"", "").replace('[', ' ').replace(']', ' ');
        String[] parts = newJSON.split(",");
        for (String part : parts){
            String[] params = part.split(":");
            if("фамилия".equals(params[0].trim())) {
                sb = new StringBuilder(ELEMENT1).append(params[1]);
            }
            else if("оценка".equals(params[0].trim())) sb.append(ELEMENT2).append(params[1]);
            else if("предмет".equals(params[0].trim())) {
                sb.append(ELEMENT3).append(params[1]);
                System.out.println(sb);
            }
        }
    }
}