package uk.ac.york.eng2.products.resources;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.products.domain.Tag;
import uk.ac.york.eng2.products.dto.TagCreateDTO;

import java.util.List;

@Client(TagController.PREFIX)
public interface TagClient {

    @Get
    List<Tag> getTags();

    @Post
    HttpResponse<Void> createTag(@Body TagCreateDTO dto);

    @Get("/{id}")
    Tag getTag(@PathVariable long id);

    @Put("/{id}")
    HttpResponse updateTag(@Body TagCreateDTO dto, @PathVariable long id);

    @Delete("/{id}")
    HttpResponse deleteTag(@PathVariable long id);
}
