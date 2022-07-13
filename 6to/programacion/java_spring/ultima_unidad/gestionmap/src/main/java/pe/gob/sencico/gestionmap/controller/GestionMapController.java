package pe.gob.sencico.gestionmap.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.gob.sencico.gestionmap.model.FormatImage;
import pe.gob.sencico.gestionmap.model.GestionMapModel;
import pe.gob.sencico.gestionmap.service.GestionMapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("galeria")
@SessionAttributes("gestionmap")
public class GestionMapController {

    @Autowired
    @Qualifier("gestionMapService")
    private GestionMapService gestionMapService;
    
    @GetMapping("/show")
    public String listMapas(Model model) {
        List<GestionMapModel> listModel = gestionMapService.findAll();
        model.addAttribute("gestionmap", listModel);
        return "mapQuery";
    }
    
    @GetMapping("/add")
    public String add(Model model) {
        GestionMapModel model_default =  new GestionMapModel();
        
        model_default.setService("WMS");
        model_default.setVersion("1.1.0");
        model_default.setRequest("GetMap");
        model_default.setStyles("");
        model_default.setLongitudIzquierda(-81.3917770385742D);
        model_default.setLatitudIzquierda(-18.4427947998047D);
        model_default.setLongitudDerecha(-68.5900115966797D);
        model_default.setLatitudDerecha(0.0529556907713413);
        model_default.setWidth(531);
        model_default.setHeight(768);
        model_default.setSrc("EPSG:4326");
        model_default.setFormat("image/png");
        
        model.addAttribute("gestionmap", model_default);
        return "mapForm";
    }
    
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        List<FormatImage> listFormatImage = new LinkedList<>();
        
        listFormatImage.add(new FormatImage("image/png"));
        listFormatImage.add(new FormatImage("image/png8"));
        listFormatImage.add(new FormatImage("image/jpeg"));
        listFormatImage.add(new FormatImage("image/gif"));
        listFormatImage.add(new FormatImage("image/svg"));
        
        model.addAttribute("gestionmap", gestionMapService.findById(id));
        model.addAttribute("flag", "actualizacion");
        model.addAttribute("listFormat", listFormatImage);
        return "mapForm";
    }
    
    @PostMapping("/save")
    public String save(@ModelAttribute("gestionmap") GestionMapModel gestionMapModel) {
        gestionMapService.save(gestionMapModel);
        return "redirect:/galeria/show";
    }
    
    @GetMapping("/del/{id}")
    public String del(@PathVariable Long id) {
        gestionMapService.deleteById(id);
        return "redirect:/galeria/show";
    }

        //--Para ver la galeria de mapas
    
        @GetMapping("/view")
        public String listarMapas(Model model) {
            List<GestionMapModel> listModel = gestionMapService.findAll();
            model.addAttribute("listmapas",listModel);
            return "mapas";
        }

        @GetMapping("/showmap/{id}")
        public String verMapa(@PathVariable Long id, Model model) {
            GestionMapModel modelgm = gestionMapService.findById(id);
            model.addAttribute("mapa",modelgm);
            return "viewmap";
        }
}