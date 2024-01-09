package org.najot.service;

import org.najot.model.Maxsulot;

import java.util.List;

public interface MaxsulotService {

    Maxsulot getMaxsulotById(Integer id);
    List<Maxsulot> getMaxsulotList();

    void createMaxsulot(Maxsulot maxsulot);
    void updateMaxsulot(Integer id, Maxsulot maxsulot);
    void deleteMaxsulot(Integer id);

}
