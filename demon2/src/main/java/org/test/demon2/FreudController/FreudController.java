package org.test.demon2.FreudController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.demon2.FreudService.FreudService;


@RestController
@RequestMapping("/freud")
public class FreudController {
    @Autowired
    FreudService fs;

    @RequestMapping("{id}")
    public String getWord(@PathVariable("id") String id) {

        return fs.getFreudWord(id);
    }
}
