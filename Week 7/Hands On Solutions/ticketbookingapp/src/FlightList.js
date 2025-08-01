import React from "react";

const flights = [
  {
    id: 1,
    from: "Delhi",
    to: "Mumbai",
    time: "10:00 AM",
    price: "₹4500",
  },
  {
    id: 2,
    from: "Bangalore",
    to: "Chennai",
    time: "1:30 PM",
    price: "₹3200",
  },
  {
    id: 3,
    from: "Kolkata",
    to: "Hyderabad",
    time: "4:15 PM",
    price: "₹5000",
  },
];

function FlightList({ showBooking }) {
  const bookTicket = (flight) => {
    alert(`Ticket booked for ${flight.from} → ${flight.to}`);
  };

  return (
    <div className="flight-list">
      {flights.map((flight) => (
        <div className="flight-card" key={flight.id}>
          <h3>
            {flight.from} → {flight.to}
          </h3>
          <p>Time: {flight.time}</p>
          <p>Price: {flight.price}</p>
          {showBooking && (
            <button onClick={() => bookTicket(flight)}>Book Ticket</button>
          )}
        </div>
      ))}
    </div>
  );
}

export default FlightList;
