package com.webapp.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.webapp.service.CatService;

@WebServlet(value = "/cat")
public class CatController extends HttpServlet {

    private CatService catService = new CatService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        catService.getAllCats(req, res);

    }

    // @Override
    // protected void doPost(HttpServletRequest req, HttpServletResponse res) {
    // catService.createCat(req, res);

    // }

    // @Override
    // protected void doPut(HttpServletRequest req, HttpServletResponse res) {
    // catService.updateCat(req, res);

    // }

    // @Override
    // protected void delete(HttpServletRequest req, HttpServletResponse res) {
    // catService.deleteCat(req, res);

    // }
}
