package tw.com.hyberx.model.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

import tw.com.hyberx.model.entity.Company;
import tw.com.hyberx.model.entity.Product;

public interface CompanyDAO extends  _DAO<Company>, GenericDAO<Company, Long> {

}
