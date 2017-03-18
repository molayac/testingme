package co.com.ias.controller;

import co.com.ias.model.Ave;
import co.com.ias.repository.AveRepository;
import co.com.ias.repository.PaisRepository;
import co.com.ias.repository.ZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by SAM on 18/03/2017.
 */
@RestController
@RequestMapping("/aves")
public class AveController {
    @Autowired
    private AveRepository repo;
//    @Autowired
//    private PaisRepository repoPais;
//    @Autowired
//    private ZonaRepository repoZona;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ave> findItems() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Ave addItem(@RequestBody Ave item) {
        item.setId(null);
        return repo.saveAndFlush(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Ave updateItem(@RequestBody Ave updatedItem, @PathVariable String id) {
        updatedItem.setId(id);
        return repo.saveAndFlush(updatedItem);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable String id) {
        repo.delete(id);
    }
}
