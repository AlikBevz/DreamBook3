package org.test.demon2.FreudService;

import org.springframework.stereotype.Service;
import org.test.demon2.FreudModel.FreudModel;



import java.util.HashMap;
import java.util.Map;

@Service
public class FreudService {
    Map<String, String> FreudWord = new HashMap<String, String>();

    public FreudService() {
        FreudModel fm = new FreudModel();

        FreudWord.put("abazhur", fm.word[0]);
        FreudWord.put("abricos", fm.word[1]);

    }

    public String getFreudWord (String id) {
        if (FreudWord.containsKey(id)) return FreudWord.get(id);
                else return null;

    }

}
