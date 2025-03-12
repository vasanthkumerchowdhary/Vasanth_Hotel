package com.phegondev.PhegonHotal.service.interfac;


import com.phegondev.PhegonHotal.dto.Response;
import com.phegondev.PhegonHotal.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
