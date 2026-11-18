package com.mycompany.tp3.exercice3;

import java.util.HashMap;
import java.util.Map;

/** TP3 - Exercice 3 : HashMap. */
public class ExerciceHashMap {
    public static void main(String[] args) {
        // 14. Création et insertion
        HashMap<String, Integer> students = new HashMap<>();
        students.put("E001", 15);
        students.put("E002", 12);
        students.put("E003", 18);
        students.put("E004", 9);

        // 15. Note de E002
        System.out.println("Note de E002 : " + students.get("E002"));

        // 16. Modifier la note de E004
        students.put("E004", 11);

        // 17. E005 existe ?
        System.out.println("E005 existe ? " + students.containsKey("E005"));

        // 18. Supprimer E001
        students.remove("E001");

        // 19. Affichage avec entrySet()
        for (Map.Entry<String, Integer> e : students.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
