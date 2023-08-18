package board.board.service;

import board.board.entity.Board;
import board.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    public void write(Board board) {

        boardRepository.save(board);
    }

    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }
}
