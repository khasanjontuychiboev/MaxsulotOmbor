package org.najot.service;

import org.najot.dao.MaxsulotDAO;
import org.najot.model.Maxsulot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaxsulotServiceImpl implements MaxsulotService{

    @Autowired
    private MaxsulotDAO maxsulotDAO;
    @Override
    public Maxsulot getMaxsulotById(Integer id) {
        return maxsulotDAO.selectMaxsulotById(id);
    }

    @Override
    public List<Maxsulot> getMaxsulotList() {
        return maxsulotDAO.selectAllMaxsulot();
    }

    @Override
    public void createMaxsulot(Maxsulot maxsulot) {

    }

    @Override
    public void updateMaxsulot(Integer id, Maxsulot maxsulot) {

    }

    @Override
    public void deleteMaxsulot(Integer id) {

    }
}
