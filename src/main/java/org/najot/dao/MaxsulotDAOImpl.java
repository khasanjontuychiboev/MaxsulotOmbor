package org.najot.dao;

import org.najot.mapper.MaxsulotMapper;
import org.najot.model.Maxsulot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MaxsulotDAOImpl implements MaxsulotDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Maxsulot selectMaxsulotById(Integer id) {

        return (Maxsulot) jdbcTemplate
                .queryForObject("select * from maxsulot where id=?",
                        new Object[]{id}, new MaxsulotMapper());
    }

    @Override
    public List<Maxsulot> selectAllMaxsulot() {
        return jdbcTemplate.query("select * from maxsulot",new MaxsulotMapper());
    }

    @Override
    public void insertMaxsulot(Maxsulot maxsulot) {

    }

    @Override
    public void updateMaxsulot(Integer id, Maxsulot maxsulot) {

    }

    @Override
    public void deleteMaxsulot(Integer id) {

    }
}
