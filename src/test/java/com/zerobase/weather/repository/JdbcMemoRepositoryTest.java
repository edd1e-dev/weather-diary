package com.zerobase.weather.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.zerobase.weather.domain.Memo;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class JdbcMemoRepositoryTest {
    @Autowired JdbcMemoRepository jdbcMemoRepository;

    @Test
    void insertMemoTest() {
        // given 주어진 것
        Memo newMemo = new Memo(2, "insertMemoTest");
        // when ~을 했을 때
        jdbcMemoRepository.save(newMemo);
        // then
        Optional<Memo> result = jdbcMemoRepository.findById(2);
        assertEquals(result.get().getText(), "insertMemoTest");
    }

    @Test
    void findAllMemoTest() {
        // given
        List<Memo> memoList = jdbcMemoRepository.findAll();
        System.out.println(memoList);
        assertNotNull(memoList);
    }
}