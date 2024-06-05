package org.example.blogproject.board;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BoardController {

//    private final BoardService boardService;
    private final HttpSession session;

    @GetMapping("/")
    public String list() {
        return "list";
    }

    @GetMapping("/boards/games")
    public String gameList() {
        return "list/games-list";
    }

    @GetMapping("/boards/sports")
    public String sportsList() {
        return "list/sports-list";
    }

    @GetMapping("/boards/movies")
    public String moviesList() {
        return "list/movies-list";
    }

    @GetMapping("/boards/foods")
    public String foodsList() {
        return "list/foods-list";
    }

    @GetMapping("/boards/save-form")
    public String saveForm() {
        return "board/save-form";
    }


}
