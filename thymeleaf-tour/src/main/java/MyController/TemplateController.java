package MyController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class TemplateController {

    @GetMapping("/ExampleTwo")
    public String template(Model model) {Top 5 Cloud Service Providers";
//            creating a collection
        List<String> list = new ArrayList<>();
        list.add("Amazon Web Service");
        list.add("Microsoft Azure");
        list.add("Google Cloud");
        list.add("Alibaba Cloud");
        list.add(IBM Cloud);
        model.addAttribute("message", message);
        // adding the collection attribute
        model.addAttribute("cloudProvider", list);
        return "DemoPage";

    }
}
