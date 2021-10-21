package com.wolk.Planet.dao;

import com.wolk.Planet.entity.PlanetDetails;

public interface PlanetSystemDAO {

		boolean save(PlanetDetails entity);

		boolean getById(int id);

		boolean updateById(PlanetDetails entity);

		boolean deleteById(PlanetDetails entity);

}
