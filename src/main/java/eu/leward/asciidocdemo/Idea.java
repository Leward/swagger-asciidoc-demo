package eu.leward.asciidocdemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "An idea suggested by on of our members.")
public class Idea {

    @ApiModelProperty(value = "Descriptive title for the idea", example = "Go more often on trip", required = true)
    private String title;

    public Idea(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
