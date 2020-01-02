package com.wxs.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RhymeToIndexController {

    @RequestMapping("rhyme")
    public String toRhymeLogin(){
        return "login";
    }

    @RequestMapping("index")
    public String toRhymeIndex(){
        return "index";
    }

    @RequestMapping("about")
    public String toRhymeAbout(){
        return "about";
    }

    @RequestMapping("album")
    public String toRhymeAlbum(){
        return "album";
    }

    @RequestMapping("leacots")
    public String toRhymeLeacots(){
        return "leacots";
    }

    @RequestMapping("whisper")
    public String toRhymeWhisper(){
        return "Whisper";
    }

    @RequestMapping("details")
    public String toRhymeDetails(){
        return "details";
    }
}
