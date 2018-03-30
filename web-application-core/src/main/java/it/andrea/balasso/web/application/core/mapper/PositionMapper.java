package it.andrea.balasso.web.application.core.mapper;

import it.andrea.balasso.web.application.core.dbo.PositionDbo;
import it.andrea.balasso.web.application.core.dto.PositionDto;
import it.andrea.balasso.web.application.core.entity.Position;
import org.mapstruct.Mapper;

@Mapper
public interface PositionMapper {

    PositionDbo dto2dbo(PositionDto positionDto);

    Position dbo2entity(PositionDbo positionDbo);

    PositionDbo entity2dbo(Position position);

    PositionDto dbo2dto(PositionDbo positionDbo);

}
