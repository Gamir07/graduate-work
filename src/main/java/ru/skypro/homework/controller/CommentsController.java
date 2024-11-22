package ru.skypro.homework.controller;

import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.Comment;
import ru.skypro.homework.dto.Comments;
import ru.skypro.homework.dto.CreateOrUpdateComment;

@RestController
@RequestMapping("/ads")
public class CommentsController {

    @GetMapping(value = "/{id}/comments")
    public Comments getComments(@PathVariable Integer id){
        return new Comments();
    }

    @PostMapping(value = "/{id}/comments")
    public Comment addComment(@PathVariable Integer id, @RequestBody CreateOrUpdateComment newComment){
        return new Comment();
    }

    @DeleteMapping(value = "/{adId}/comments/{commentId}")
    public void deleteComment(@PathVariable Integer adId, @PathVariable Integer commentId){

    }
    @PatchMapping(value = "/{adId}/comments/{commentId}")
    public Comment updateComment(@PathVariable Integer adId, @PathVariable Integer commentId, @RequestBody CreateOrUpdateComment newComment){
        return new Comment();
    }
}
