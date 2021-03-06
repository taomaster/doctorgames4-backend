package doctorgames4.service.impl;

import doctorgames4.business.SubtypeGame;
import doctorgames4.dao.SubtypeGameDao;
import doctorgames4.service.SubtypeGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Human Booster on 21/09/2017.
 */
@Service
public class SubtypeGameServiceImpl implements SubtypeGameService {
    @Autowired
    private SubtypeGameDao dao;

    public List<SubtypeGame> getAll() {
        return dao.findAll();
    }

    public SubtypeGame getOne(Long id) {
        return dao.getOne(id);
    }

    public SubtypeGame add(SubtypeGame game) {
        return dao.save(game);
    }

    public void delete(Long id) {
        dao.delete(id);
    }
}
