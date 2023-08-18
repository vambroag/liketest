package board.board.controller;

import board.board.entity.Board;
import board.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {


    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm() {

        return "boardcash-1";

    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board) {

        boardService.write(board);

        return "boardcash-2";
    }

    @RequestMapping("/board/boardcash-3.html")
    public String boardcash3(Board board) {

        boardService.write(board);

        return "boardcash-3";

    }

    @RequestMapping("/board/boardcash-4.html")
    public String boardcash4() {


        return "boardcash-4";

    }

/*
    @GetMapping("/board/view") // localhost:8090/board/view?id=1
    public String boardView(Model model, Integer id) {

        model.addAttribute("board", boardService.boardView(id));


        return "boardview";
    }
*/

}
