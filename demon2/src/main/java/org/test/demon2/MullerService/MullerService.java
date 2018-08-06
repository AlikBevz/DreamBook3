package org.test.demon2.MullerService;

import org.springframework.stereotype.Service;
import org.test.demon2.MullerModel.MullerModel;


import java.util.HashMap;

import java.util.Map;


@Service
public class MullerService {

    Map<String, String> MullerWord = new HashMap<String, String>();


    public MullerService() {
        MullerModel mm = new MullerModel();

        MullerWord.put("abort", mm.word[0]);
        MullerWord.put("abricos", mm.word[1]);

    }


    public String getMullerWord (String id) {
        if (MullerWord.containsKey(id)) return MullerWord.get(id);
        else return null;

    }

}




