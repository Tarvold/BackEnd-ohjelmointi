@Controller
public class RequestParameters {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String location, @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    }
}
