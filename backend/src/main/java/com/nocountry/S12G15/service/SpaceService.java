package com.nocountry.S12G15.service;


import com.nocountry.S12G15.dto.request.SpaceRequestDTO;
import com.nocountry.S12G15.dto.response.SpaceResponseDTO;
import com.nocountry.S12G15.exception.MyException;

import java.util.List;
//import org.springframework.stereotype.Service;


public interface SpaceService {


    SpaceResponseDTO createSpace(SpaceRequestDTO newSpace) throws MyException;
    List<SpaceResponseDTO> getAllSpaces();
    List<SpaceResponseDTO> getEnabledSpaces();
    SpaceResponseDTO findSpaceById(String idSpace);
    SpaceResponseDTO updateSpace(String idSpace, SpaceRequestDTO updatedSpaceDTO) throws MyException;
    SpaceResponseDTO disableSpace(String idSpace);
    SpaceResponseDTO enableSpace(String idSpace);
    SpaceResponseDTO addChannelToSpace(String idSpace, String idChannel) throws MyException;
    SpaceResponseDTO addBoardToSpace(String idSpace, String idBoard) throws MyException;
}