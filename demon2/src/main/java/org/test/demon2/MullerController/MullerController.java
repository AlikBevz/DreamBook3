package org.test.demon2.MullerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.demon2.MullerService.MullerService;


@RestController
@RequestMapping("/muller")
public class MullerController {
    @Autowired
    MullerService ms;

    @RequestMapping("{id}")
    public String getWord(@PathVariable("id") String id) {

        return ms.getMullerWord(id);
    }

   /* @RequestMapping("/abort")
    public String getAbort() {return ms.getAbort();}*/
}
