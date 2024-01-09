package org.najot.dao;

import org.najot.model.Maxsulot;

import java.util.List;

public interface MaxsulotDAO {
    Maxsulot selectMaxsulotById(Integer id);
    List<Maxsulot> selectAllMaxsulot();

    void insertMaxsulot(Maxsulot maxsulot);
    void updateMaxsulot(Integer id, Maxsulot maxsulot);

    void deleteMaxsulot(Integer id);
}
