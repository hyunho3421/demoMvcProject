package com.example.demo.controller;

import com.example.demo.model.DiskInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/graph/")
public class GraphController {

    @GetMapping("graph")
    public String graph() {
        return "graph/graph";
    }

    @GetMapping("diskInfo")
    public ResponseEntity<Map<String, Object>> diskInfo() {
        ResponseEntity<Map<String, Object>> entity = null;
        Map<String, Object> map = new HashMap<>();

        try {
            File[] roots = File.listRoots();

            List<DiskInfo> list = new ArrayList<>();

            for (File file : roots) {
                double free = file.getFreeSpace() / Math.pow(1024, 3);
                double total = file.getTotalSpace() / Math.pow(1024, 3);

                list.add(new DiskInfo(free, total));
            }

            map.put("diskInfo", list);
            entity = new ResponseEntity<>(map, HttpStatus.OK);
        } catch (Exception e) {
            entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return entity;
    }

}
