package wolk;

import wolk.MarketDTO;

public interface MarketDAO {
    boolean save(MarketDTO dto);
    boolean updateNoOfShop(MarketDTO dto);
    void getAll();
    boolean getByLocation(MarketDTO dto);
    boolean deleteById(MarketDTO dto);
}
