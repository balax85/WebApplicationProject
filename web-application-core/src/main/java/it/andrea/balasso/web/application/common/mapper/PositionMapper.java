package it.andrea.balasso.web.application.common.mapper;

import it.andrea.balasso.web.application.common.dbo.PositionDbo;
import it.andrea.balasso.web.application.common.dto.PositionDto;
import it.andrea.balasso.web.application.common.entity.Position;
import org.mapstruct.Mapper;

@Mapper
public interface PositionMapper {

    PositionDbo dto2dbo(PositionDto positionDto);

    Position dbo2entity(PositionDbo positionDbo);

    PositionDbo entity2dbo(Position position);

    PositionDto dbo2dto(PositionDbo positionDbo);

}
