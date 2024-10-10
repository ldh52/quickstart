package kr.co.yahopet.quickstart.service;

import kr.co.yahopet.quickstart.dto.ItemDto;
import kr.co.yahopet.quickstart.entity.ItemEntity;
import kr.co.yahopet.quickstart.mapper.QuickMapper;
import kr.co.yahopet.quickstart.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class QuickService {

    @Autowired
    private QuickMapper quickMapper;

    @Autowired
    private ItemRepository itemRepository;

    public boolean registerItem(ItemDto itemDto) {
        // TODO: DB insert

//        HashMap<String, Object> paramMap = new HashMap<>();
//
//        paramMap.put("id", itemDto.getId());
//        paramMap.put("name", itemDto.getName());
//
//        quickMapper.registerItem(paramMap);
//
//        log.info("service ...");

        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setId(itemDto.getId());
        itemEntity.setName(itemDto.getName());

        itemRepository.save(itemEntity);

        return true;
    }

    public ItemDto getItemById(String id) {

//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("id", id);
//
//        HashMap<String, Object> res = quickMapper.findById(paramMap);
//
//        ItemDto itemDto = new ItemDto();
//        itemDto.setId((String)res.get("ID"));
//        itemDto.setName((String)res.get("NAME"));
//
//        return itemDto;


        ItemEntity itemEntity = itemRepository.findById(id).get();

        ItemDto itemDto = new ItemDto();

        itemDto.setId(itemEntity.getId());
        itemDto.setName(itemEntity.getName());


        return itemDto;
    }
}
