package org.test.demon2.NostrService;

import org.springframework.stereotype.Service;
import org.test.demon2.NostrModel.NostrModel;


import java.util.HashMap;
import java.util.Map;

@Service
public class NostrService {
    Map<String, String> NostrWord = new HashMap<String, String>();

    public NostrService() {
        NostrModel nm = new NostrModel();

        NostrWord.put("angel", nm.word[0]);
        NostrWord.put("army", nm.word[1]);

    }

    public String getNostrWord (String id) {
        if (NostrWord.containsKey(id)) return NostrWord.get(id);
        else return null;

    }

}
