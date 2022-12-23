package com.example.service;

import com.example.domain.BoardDTO;
import com.example.mapper.BoardMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j
public class BoardServiceImpl implements BoardService {
    @Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;

    @Override
    public List<BoardDTO> getList() {
        log.info("==========getList============");
        return mapper.getList();
    }

    @Override
    public void regist(BoardDTO board) {

    }

    @Override
    public BoardDTO get(Long boardNum) {
        return null;
    }

    @Override
    public boolean modify(BoardDTO board) {
        return false;
    }

    @Override
    public boolean remove(Long boardNum) {
        return false;
    }
}
