package eu.leward.asciidocdemo;

import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// tag::class[]
@RestController
@RequestMapping("/ideas")
@Api(description = "View ideas proposed by our members")
public class IdeaController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "List all the ideas")
    public List<Idea> list() {
        return Lists.newArrayList(
                new Idea("Idea 1"),
                new Idea("Idea 2"),
                new Idea("Idea 3")
        );
    }
}
// end::class[]
