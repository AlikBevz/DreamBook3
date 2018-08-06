package org.test.demon2.NostrController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.demon2.NostrService.NostrService;

@RestController
@RequestMapping("/nostr")
public class NostrController {
    @Autowired
    NostrService ns;

    @RequestMapping("{id}")
    public String getWord(@PathVariable("id") String id) {
        return ns.getNostrWord(id);
    }
}
