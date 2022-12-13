package movieweb.webapp.service;


import movieweb.webapp.domain.repository.BoardRepository;
import movieweb.webapp.model.dto.Board;
import movieweb.webapp.model.dto.BoardDto;
import movieweb.webapp.model.dto.Theater;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public interface BoardService {

    public List<Board> getAllBoardData();

    public void addBoardData(Board board);

//    private BoardRepository boardRepository;
//    public BoardService(BoardRepository boardRepository) {
//        this.boardRepository = boardRepository;
//    }
//
//    @Transactional
//    public Long savePost(BoardDto boardDto) {
//        return boardRepository.save(boardDto.toEntity()).getId();
//    }
//
//    @Transactional
//    public List<BoardDto> getBoardList() {
//        List<Board> boardList = boardRepository.findAll();
//        List<BoardDto> boardDtoList = new ArrayList<>();
//
//        for(Board board : boardList) {
//            BoardDto boardDto = BoardDto.builder()
//                    .id(board.getId())
//                    .author(board.getAuthor())
//                    .title(board.getTitle())
//                    .content(board.getContent())
//                    .createdDate(board.getCreatedDate())
//                    .build();
//            boardDtoList.add(boardDto);
//        }
//        return boardDtoList;
//    }
//
//    @Transactional
//    public BoardDto getPost(Long id) {
//        Board board = boardRepository.findById(id).get();
//
//        BoardDto boardDto = BoardDto.builder()
//                .id(board.getId())
//                .author(board.getAuthor())
//                .title(board.getTitle())
//                .content(board.getContent())
//                .likes(board.getLikes())
//                .createdDate(board.getCreatedDate())
//                .build();
//        return boardDto;
//    }
//
//    @Transactional
//    public void deletePost(Long id) {
//        boardRepository.deleteById(id);
//    }
}