package in.ineuron.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class WishMessageServiceImpl implements IWishMessageService {

	@Override
	public String generateWish() {
		LocalDateTime dt = LocalDateTime.now();
		int hour = dt.getHour();
		
		
		String msg = hour<12?"Good Morning":
							hour<16?"Good Afternoon":
								hour<20?"Good Evening":
									"Good Night";
						
		return msg;
	}

}
